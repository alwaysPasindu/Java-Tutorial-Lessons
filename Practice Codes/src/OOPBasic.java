 class Phone {
            String name;
            String color;
            int ram;


            public void call()
            {
                System.out.println("Take a call from " + name);
            }

            public void browseInternet()
            {
                System.out.println("Browse Internet");
            }

            public static void main(String[] args) {
                Phone phone1= new Phone();
                phone1 .name ="Samsung";
                phone1.color = "Black";
                phone1.call();

                Phone phone2 = new Phone();
                phone2.name = "Apple";
                phone2.call();
                System.out.println(phone1.color);
            }


    }


