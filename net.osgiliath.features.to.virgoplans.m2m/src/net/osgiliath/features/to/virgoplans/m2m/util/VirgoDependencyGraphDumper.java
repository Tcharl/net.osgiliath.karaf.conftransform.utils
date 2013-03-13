package net.osgiliath.features.to.virgoplans.m2m.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.sonatype.aether.graph.DependencyNode;
import org.sonatype.aether.graph.DependencyVisitor;

public class VirgoDependencyGraphDumper implements DependencyVisitor {
	private static Logger log = Logger
			.getLogger(VirgoDependencyGraphDumper.class.getSimpleName());
	private List<String> dependencyList;
	private String currentIndent = "";

	public VirgoDependencyGraphDumper() {
	}

	

	public void setDependencyList(List<String> dependencyList) {
		this.dependencyList = dependencyList;
	}

	public boolean visitEnter(DependencyNode node) {
		log.debug(currentIndent + node);
		if (currentIndent.length() <= 0) {
			currentIndent = "+- ";
		} else {
			currentIndent = "|  " + currentIndent;
			String karafStyleNode = node.getDependency().getArtifact()
					.getGroupId()
					+ ":"
					+ node.getDependency().getArtifact().getArtifactId()
					+ ":" + node.getDependency().getArtifact().getVersion();
			if (node.getDependency().getArtifact().getExtension() != null
					&& !node.getDependency().getArtifact().getExtension()
							.isEmpty()) {
				karafStyleNode += ":"
						+ node.getDependency().getArtifact().getExtension();
			}
			if (node.getDependency().getArtifact().getClassifier() != null
					&& !node.getDependency().getArtifact().getClassifier()
							.isEmpty()) {
				karafStyleNode += ":"
						+ node.getDependency().getArtifact().getClassifier();
			}
			dependencyList.add(karafStyleNode);
		}

		return true;
	}

	public boolean visitLeave(DependencyNode node) {
		currentIndent = currentIndent.substring(3, currentIndent.length());
		return true;
	}

}
