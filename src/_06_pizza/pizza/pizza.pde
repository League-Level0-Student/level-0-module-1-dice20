import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch



void setup() {
    size(500, 500);
    fill(#FFEA9D);
    
    minim = new Minim(this);      //in the setup method
sound = minim.loadFile("a.mp3");      //in the setup method


PImage box = loadImage("box.png");     //in setup method
box.resize(width, height);      //to match your canvas size
background(box);       //in setup method

box.resize(0,500);

image(box ,0, 0 );

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

sound.play();
sound.rewind();

}




}
