class car {

String brand;

int newValue;

int currentValue;


/*void retunring nothing - methods just prints due to sysout when called

void ValueLost() {

System.out.println(newValue - currentValue);

}*/


//This method now returns an int value called Lost.

int ValueLost(){

int Lost = newValue - currentValue;


return Lost; // return jumps out of function

}


//getter method to just return the new value - to be used in the main program.

int getNewValue (){

return newValue;

}


}


public class getters {


public static void main(String[] args) {


car polo = new car();

polo.newValue = 8000;

polo.currentValue = 2000;

polo.brand = "VW";


//assigning variable with method output

int currentvalueofmycar = polo.ValueLost();

System.out.println(currentvalueofmycar);


// using a getter to get the data of the variables newValue

int NEWVALUE = polo.getNewValue();

System.out.println(NEWVALUE);



}


}