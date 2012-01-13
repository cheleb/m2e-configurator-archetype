#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${artifactId}.configurator;

import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import ${artifactId}.configuration.${classPrefix}Configuration;
import ${artifactId}.configuration.${classPrefix}ConfigurationHelper;


public class ${classPrefix}Configurator extends AbstractProjectConfigurator {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(${classPrefix}Configurator.class);

	private static final String MOJO_GA = "${mojoGroupId}:${mojoArtifactId}";

	@Override
	public void configure(
			ProjectConfigurationRequest projectConfigurationRequest,
			IProgressMonitor monitor) throws CoreException {

		IProject project = projectConfigurationRequest.getProject();

		MavenProject mavenProject = projectConfigurationRequest
				.getMavenProject();

		Plugin plugin = mavenProject
				.getPlugin(MOJO_GA);
		if (plugin == null) {
			LOGGER.info("Should not occurs ... but could not set eclipse settings, consider " + MOJO_GA + "!");
		} else {
			LOGGER.info("Using " + MOJO_GA + "  configuration");
			
			${classPrefix}Configuration conf = ${classPrefix}ConfigurationHelper.extractConfiguration(plugin);
			
			
		}

	}



}
