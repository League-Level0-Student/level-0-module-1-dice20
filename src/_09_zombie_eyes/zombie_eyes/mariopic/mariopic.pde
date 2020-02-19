
void setup() {
  size(1200, 1200);
  PImage face = loadImage("mario (1).png");
  image(face, 0, 0);
  face.resize(width, height);
  background(face);
}

void draw() {


  fill(mouseX, mouseY,50);
  ellipse(460, 650, 120, 200);
   fill(mouseX, mouseY,50);
  ellipse(760, 650, 120, 200);
  fill(0,0,0);
  ellipse(480, 650, 60, 90);

  fill(0,0,0);
  ellipse(740, 650, 60, 90);
}
