package com.stefanvuckovic.domainmodel;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;

@SuppressWarnings("all")
public class CustomServiceProvider extends DefaultResourceServiceProvider {
  @Override
  public boolean canHandle(final URI uri) {
    boolean _xblockexpression = false;
    {
      final String ext = uri.fileExtension();
      final boolean bool = Objects.equal(ext, "domain");
      _xblockexpression = bool;
    }
    return _xblockexpression;
  }
}
