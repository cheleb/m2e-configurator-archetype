#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${artifactId}.configuration;

import org.apache.maven.model.Plugin;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${classPrefix}ConfigurationHelper {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(${classPrefix}ConfigurationHelper.class);


	public static ${classPrefix}Configuration extractConfiguration(Plugin eclipsePlugin) {

		Xpp3Dom configurationXpp3Dom = (Xpp3Dom) eclipsePlugin
				.getConfiguration();

		if (configurationXpp3Dom == null) {
			LOGGER.warn("No configuration provided.");
			return null;
		}
        ${classPrefix}Configuration conf = new ${classPrefix}Configuration();
		return conf;
	}


}
