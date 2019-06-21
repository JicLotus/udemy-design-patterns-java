package ex1;

public class CodeBuilder
{
    protected CodeClass codeClass;

    public CodeBuilder(String className)
    {
        codeClass = new CodeClass(className);
    }
    public CodeBuilder addField(String name, String type)
    {
        codeClass.addField(name,type);
        return this;
    }
    @Override
    public String toString()
    {
        return codeClass.toString();
    }
}