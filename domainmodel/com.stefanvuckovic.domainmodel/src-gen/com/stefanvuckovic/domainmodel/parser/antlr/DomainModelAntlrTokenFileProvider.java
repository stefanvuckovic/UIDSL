/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomainModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/stefanvuckovic/domainmodel/parser/antlr/internal/InternalDomainModel.tokens");
	}
}
