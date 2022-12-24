int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(10, 10, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
   fill(#939393);
   ellipse(105,105,200,200);
   fill(#E8F0EF);
   ellipse(75,75,50,50);
   
   
}
