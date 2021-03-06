/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.rio.helpers;

import org.eclipse.rdf4j.model.ValueFactory;

/**
 * @deprecated since 2.0. Use {@link AbstractRDFParser} instead.
 * @author Jeen Broekstra
 */
@Deprecated
public abstract class RDFParserBase extends AbstractRDFParser {

	protected RDFParserBase() {
		super();
	}

	protected RDFParserBase(ValueFactory factory) {
		super(factory);
	}
}
