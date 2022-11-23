package pack1;

class private_sp
{
    private void display()
    {
        System.out.println("You are using private access specifier");
    }
    void bypass()
    {
        private_sp obj= new private_sp();
        obj.display();
    }
}

