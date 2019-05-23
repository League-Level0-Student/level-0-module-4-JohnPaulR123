PImage chopper;
PImage creeper;
PImage bigCreeper;
boolean found=false;
void setup(){
  bigCreeper=loadImage("creeper.jpg");
  chopper=loadImage("chopper.jpg");
  creeper=loadImage("creeper.jpg");
  creeper.resize(10,10);
  size(1250,700);
  chopper.resize(1250,700);
  background(chopper);
  
}

void draw(){
 
  image(creeper, 849, 586);
  if(mousePressed){
if(mouseX>850 && mouseX<860 && mouseY>587 && mouseY<597){
found=true;
}
if(found){
  bigCreeper.resize(1250,700);
  background(bigCreeper);
   text("You found me!!",625,350);
}
  else {
  background(chopper);
  }
}
}