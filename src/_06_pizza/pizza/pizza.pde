
void setup() {
    size(500, 500);
    fill(#FFEA9D);

PImage box = loadImage("box.png");
image(box ,100, 350 );
ellipse(250, 250, 250, 250);

fill(#FF0000);
ellipse(250, 250, 230,230);

fill(#FFE600);
ellipse(250, 250, 220,220);






}
void draw() {
    
if(mousePressed){
PImage pepperoni = loadImage("pep.png");
pepperoni.resize(75, 75);
image(pepperoni, mouseX-20, mouseY-20);



}




}
