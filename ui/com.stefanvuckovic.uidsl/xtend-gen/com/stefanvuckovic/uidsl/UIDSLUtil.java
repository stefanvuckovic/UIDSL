package com.stefanvuckovic.uidsl;

import com.google.common.collect.Iterables;
import com.stefanvuckovic.uidsl.uIDSL.Field;
import com.stefanvuckovic.uidsl.uIDSL.Member;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class UIDSLUtil {
  public Iterable<Field> getFields(final ServerComponent sc) {
    EList<Member> _members = sc.getMembers();
    return Iterables.<Field>filter(_members, Field.class);
  }
  
  public Iterable<Method> getMethods(final ServerComponent sc) {
    EList<Member> _members = sc.getMembers();
    return Iterables.<Method>filter(_members, Method.class);
  }
}
