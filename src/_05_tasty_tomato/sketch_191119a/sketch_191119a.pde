PImage code;

void setup() {

  size(500, 500);
  code = loadImage("simel.png");
  code.resize(100,200);
}
void draw() {
  fill(#555455);  
  background(200, 200, 200);
    noStroke();

    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#00FF39);
    rect(176, 103, 12, 32);
if (mousePressed){
fill(#555455);
ellipse(200,200, 10, 10);
fill(#555455);
ellipse(100,200, 10, 10);
image(code, 50, 100);


}
}
