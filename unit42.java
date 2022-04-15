///program reuse class 
class House
{
Room r;
void createHouse()
{
r = new Room();
}
void displayHouse()
{
r.displayData();
}
public static void main (String args[])
{
House h = new House();
h.createHouse();
h.displayHouse();
}
}