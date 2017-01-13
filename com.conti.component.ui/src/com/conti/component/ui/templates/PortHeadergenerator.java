package com.conti.component.ui.templates;

import architecturetool.*;
import architecturetool.Runnable;
import org.eclipse.emf.common.util.EList;

public class PortHeadergenerator
{
  protected static String nl;
  public static synchronized PortHeadergenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    PortHeadergenerator result = new PortHeadergenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#ifndef ";
  protected final String TEXT_2 = "_MAIN_H_INCLUDED" + NL + "#define ";
  protected final String TEXT_3 = "_MAIN_H_INCLUDED" + NL + "" + NL + "#ifdef __cplusplus" + NL + "extern \"C\" {" + NL + "#endif";
  protected final String TEXT_4 = NL + "/*********************/" + NL + "/* request port list */" + NL + "/*********************/  ";
  protected final String TEXT_5 = NL + "typedef struct {" + NL + "    \t";
  protected final String TEXT_6 = NL + "if(";
  protected final String TEXT_7 = "> 0)" + NL;
  protected final String TEXT_8 = " *p_";
  protected final String TEXT_9 = " *p_";
  protected final String TEXT_10 = ";" + NL + "#endif";
  protected final String TEXT_11 = "const ";
  protected final String TEXT_12 = " *p_";
  protected final String TEXT_13 = " *p_";
  protected final String TEXT_14 = NL + "\t";
  protected final String TEXT_15 = NL + "    }";
  protected final String TEXT_16 = "_t_reqportPtrList;";
  protected final String TEXT_17 = NL + " ";
  protected final String TEXT_18 = NL + "/*********************/" + NL + "/* provide port list */" + NL + "/*********************/";
  protected final String TEXT_19 = NL + "typedef struct {" + NL + "    \t";
  protected final String TEXT_20 = "const ";
  protected final String TEXT_21 = " *p_";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = " *p_";
  protected final String TEXT_24 = NL + "\t";
  protected final String TEXT_25 = NL + "\t";
  protected final String TEXT_26 = NL + "    }";
  protected final String TEXT_27 = "_t_proportPtrList;";
  protected final String TEXT_28 = NL + "void ";
  protected final String TEXT_29 = " (";
  protected final String TEXT_30 = "_t_reqportPtrList const*const reqPort,";
  protected final String TEXT_31 = " GS_t_SimInitDAP *const p_SimInit, GS_t_NonSimInitDAP *const p_NonSimInit";
  protected final String TEXT_32 = ",";
  protected final String TEXT_33 = "_t_proportPtrList const*const proPort";
  protected final String TEXT_34 = ");    \t";
  protected final String TEXT_35 = NL + "void ";
  protected final String TEXT_36 = " (";
  protected final String TEXT_37 = "_t_reqportPtrList const*const reqPort, ";
  protected final String TEXT_38 = "_t_proportPtrList const*const proPort";
  protected final String TEXT_39 = ");";
  protected final String TEXT_40 = NL + NL + "\t";
  protected final String TEXT_41 = NL + "\t#ifdef __cplusplus" + NL + "}" + NL + "#endif" + NL + "#endif /*DAP_EXT_H_INCLUDED*/";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Component component = (Component) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(component.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(component.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    
boolean hasRequestPort = false;
boolean hasProviderPort = false;
EList<Runnable> itsRunnable = component.getItsRunnable();
for (Runnable runnable : itsRunnable) {
    EList<Port> port = component.getPort();
    for (Port port2 : port) {
    if(port2.getType().equals(PortListType.REQUEST)) {
    	hasRequestPort = true;
    } else {
    	hasProviderPort = true;
    }
    }
    }
    stringBuffer.append(TEXT_4);
    
for (Runnable runnable : itsRunnable) {
    stringBuffer.append(TEXT_5);
    EList<Port> port = component.getPort();
    for (Port port2 : port) {
     if(port2.getParameter()!= null){
    stringBuffer.append(TEXT_6);
    stringBuffer.append(port2.getParameter().getName());
    stringBuffer.append(TEXT_7);
     if(port2.getName()==null){
    stringBuffer.append(port2.getRef().getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(port2.getRef().getName());
    } else {
    stringBuffer.append(port2.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(port2.getName());
    }
    stringBuffer.append(TEXT_10);
    } else {
    if(port2.getType().equals(PortListType.REQUEST)) {
    stringBuffer.append(TEXT_11);
     if(port2.getName()==null){
    stringBuffer.append(port2.getRef().getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(port2.getRef().getName());
    } else {
    stringBuffer.append(port2.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(port2.getName());
    }
    }
    }
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if(hasProviderPort) {
    stringBuffer.append(TEXT_18);
    
for (Runnable runnable : itsRunnable) {
    stringBuffer.append(TEXT_19);
    EList<Port> port = component.getPort();
    for (Port port2 : port) {
    if(port2.getType().equals(PortListType.PROVIDER)) {
    stringBuffer.append(TEXT_20);
     if(port2.getName()==null){
    stringBuffer.append(port2.getRef().getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(port2.getRef().getName());
    } else {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(port2.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(port2.getName());
    }
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_27);
    }
    }

    for (Runnable runnable : itsRunnable) {
    if(component.isExternalStaticMemUsed()) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_29);
     if(hasRequestPort) {
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
     if(hasProviderPort) { 
    stringBuffer.append(TEXT_32);
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_33);
     }
    stringBuffer.append(TEXT_34);
    } else {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_36);
     if(hasRequestPort) {
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_37);
    }
     if(hasProviderPort) { 
    stringBuffer.append(runnable.getName());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
