public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray){
        this.personArray = personArray;
    }

    public String whileLoop(){
        String result = "";
        int counter = 0;
        while(counter< personArray.length){
            result += personArray[counter].toString();
          counter++;

            }
        return result;
    }
    public String forLoop() {
        String result = "";
        for (int counter = 0; counter < personArray.length; counter++) {
            result += personArray[counter].toString();
        }
        return result;
    }

    public String forEachLoop(){
        String result = "";
        for(Person s : personArray){
            result += s.toString();
        }
        return result;
        }
    }

