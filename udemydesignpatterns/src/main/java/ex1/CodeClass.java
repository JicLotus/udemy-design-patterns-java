package ex1;

import java.util.ArrayList;

public class CodeClass{

    private ArrayList<Field> fields = new ArrayList<Field>();
    private String className;

    public CodeClass(String className){
        this.className = className;
    }
    public void addField(String name,String type){
        fields.add(new Field(name,type));
    }
    @Override
    public String toString(){

        String fieldsStr = "";

        for(Field field : fields){
            fieldsStr+= String.format("\tpublic %s %s;\n",field.type,field.name);
        }

        String code = String.format("public class %s \n{\n%s}",
                className,fieldsStr);

        return code;
    }

}