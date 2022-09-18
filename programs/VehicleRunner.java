class VehicleRunner{
 
 public static void main(String[]travel){
double distance=Vehicle.transport("banglore","chennai");
System.out.println("distance= "+distance);
Vehicle.transport("banglore","chennai","yes");
Vehicle.transport("banglore","chennai","no");
Vehicle.transport("not reached");
Vehicle.transport("reached");
Vehicle.transport("banglore",true);
Vehicle.transport("banglore",false);
Vehicle.transport(true);
Vehicle.transport(false);



 }
 }