package schema.system.s144A9D5E600C68110F0BA743A9A1A7F8;

public final class TypeSystemHolder
{
    private TypeSystemHolder() { }
    public static final org.apache.xmlbeans.SchemaTypeSystem typeSystem = loadTypeSystem();
    static { typeSystem.resolve(); }
    private static final org.apache.xmlbeans.SchemaTypeSystem loadTypeSystem()
    {
        try { return (org.apache.xmlbeans.SchemaTypeSystem)Class.forName("org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl", true, TypeSystemHolder.class.getClassLoader()).getConstructor(new Class[] { Class.class }).newInstance(new Object[] { TypeSystemHolder.class }); }
        catch (ClassNotFoundException e) { throw new RuntimeException("Cannot load org.apache.xmlbeans.impl.SchemaTypeSystemImpl: make sure xbean.jar is on the classpath.", e); }
        catch (Exception e) { throw new RuntimeException("Could not instantiate SchemaTypeSystemImpl (" + e.toString() + "): is the version of xbean.jar correct?", e); }
    }
}
