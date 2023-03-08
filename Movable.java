package lab4;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovalePoint implements Movable{
    private int x,y,xspeed,yspeed;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXspeed() {
        return xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    public MovalePoint(int x, int y, int xspeed, int yspeed){
        this.x= x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void moveUp() {
        y -= yspeed;
    }

    @Override
    public void moveDown() {
        y+= yspeed;
    }

    @Override
    public void moveLeft() {
        y -= xspeed;
    }

    @Override
    public void moveRight() {
        y += xspeed ;
    }
    public String toString(){
        return "MovablePoint at ("+ x + "," +y +")";
    }
}
    class MovableCircle implements  Movable{
    private int radius;
    private MovalePoint center;

    public MovableCircle(int x, int y,int xspeed , int yspeed,int radius ){
        this.center = new MovalePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }

        public int getRadius() {
            return radius;
        }

        public MovalePoint getCenter() {
            return center;
        }

        @Override
        public void moveUp() {
        center.moveUp();

        }

        @Override
        public void moveDown() {
        center.moveDown();
        }

        @Override
        public void moveLeft() {
        center.moveLeft();
        }

        @Override
        public void moveRight() {
        center.moveRight();
    }
        public String toString(){
        return "MovableCircle with center (" + center.getX() + ","+ center.getY() + ") and radius"+ radius;
        }
    }
    class tesing{
        public static void main(String[] args) {
            MovalePoint movalePoint = new MovalePoint(2,3,1,3);
            System.out.printf(movalePoint.toString());
            MovableCircle movableCircle = new MovableCircle(1,2,3,1,6);
            System.out.printf(movableCircle.toString());
        }

    }