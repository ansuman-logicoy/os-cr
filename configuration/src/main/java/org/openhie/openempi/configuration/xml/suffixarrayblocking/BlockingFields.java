/*
 * XML Type:  blocking-fields
 * Namespace: http://configuration.openempi.openhie.org/suffix-array-blocking
 * Java type: org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.suffixarrayblocking;


/**
 * An XML blocking-fields(@http://configuration.openempi.openhie.org/suffix-array-blocking).
 *
 * This is a complex type.
 */
public interface BlockingFields extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("blockingfields6095type");
    
    /**
     * Gets array of all "blocking-field" elements
     */
    org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[] getBlockingFieldArray();
    
    /**
     * Gets ith "blocking-field" element
     */
    org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField getBlockingFieldArray(int i);
    
    /**
     * Returns number of "blocking-field" element
     */
    int sizeOfBlockingFieldArray();
    
    /**
     * Sets array of all "blocking-field" element
     */
    void setBlockingFieldArray(org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField[] blockingFieldArray);
    
    /**
     * Sets ith "blocking-field" element
     */
    void setBlockingFieldArray(int i, org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField blockingField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blocking-field" element
     */
    org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField insertNewBlockingField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blocking-field" element
     */
    org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingField addNewBlockingField();
    
    /**
     * Removes the ith "blocking-field" element
     */
    void removeBlockingField(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields newInstance() {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
