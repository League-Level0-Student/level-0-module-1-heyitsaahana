
void setup() {
  PImage face=loadImage("face.jpg");
  size(700,700);
  face.resize(600,600);
  image(face, 50,50);

}
void draw() {
 fill(mouseX,mouseY,mouseY);
 ellipse(275,250,100,100);
 ellipse(400,250,100,100);
 fill(#272525);
 ellipse(275,250,25,25);
 ellipse(400,250,25,25);

}
