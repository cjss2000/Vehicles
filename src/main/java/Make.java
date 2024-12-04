public class Make extends Model {

  //  final String name;
    // doesn't work, ChatGPT states either assign at declaration: final String name = "DefaultName"; - works best when every Make object will be the same (it's not)
    // or Inialized within the Constructor
    // could you explain this a bit more?
    // why does this look like a getter/setter

    final String name;

    public Make(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Make name= " + name;
    }

    Model hondaAccord = new Model();
    Model toyotaCamry = new Model();
    Model fordRanger = new Model();
    Model chevyS10 = new Model();

}
