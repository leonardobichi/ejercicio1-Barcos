import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        String nomMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        Especiales esp1 = new Especiales(10, 15159, 1998, 795, 5, 2);
        Especiales esp2 = new Especiales(11, 8585, 1999, 1200, 15, 4);
        Especiales esp3 = new Especiales(12, 4225, 2010, 1024, 9, 3);
        Especiales esp4 = new Especiales(13, 9758, 2005, 500, 2, 1);
        Especiales esp5 = new Especiales(14, 6325, 1995, 650, 4, 2);
        Especiales esp6 = new Especiales(15, 9898, 1985, 700, 1, 2);

        Cliente cli1 = new Cliente(15, "Leonardo", "Bichi", 42223331, esp1);
        Cliente cli2 = new Cliente(10, "Pepe", "Gomez", 42223332, esp2);
        Cliente cli3 = new Cliente(5, "Guido", "Perez", 42223333, esp3);
        Cliente cli4 = new Cliente(2, "Julian", "Crespo", 42223334, esp4);
        Cliente cli5 = new Cliente(9, "Camila", "Medina", 42223335, esp5);
        Cliente cli6 = new Cliente(4, "Maria", "Barra", 42223336, esp6);

        Alquiler alq1 = new Alquiler("2020-1-17", "2020-1-24", 2, cli1, esp1);
        Alquiler alq2 = new Alquiler("2020-2-7", "2020-2-8", 5, cli3, esp3);
        Alquiler alq3 = new Alquiler("2020-3-5", "2020-3-9", 6, cli4, esp4);
        Alquiler alq4 = new Alquiler("2020-4-9", "2020-4-15", 4, cli2, esp2);
        Alquiler alq5 = new Alquiler("2020-5-3", "2020-5-25", 3, cli5, esp5);
        Alquiler alq6 = new Alquiler("2020-6-23", "2020-6-28", 11, cli6, esp6);
        Alquiler alq7 = new Alquiler("2020-7-1", "2020-7-10", 1, cli6, esp6);
        Alquiler alq8 = new Alquiler("2020-8-4", "2020-8-13", 5, cli5, esp5);
        Alquiler alq9 = new Alquiler("2020-9-7", "2020-9-23", 11, cli2, esp2);
        Alquiler alq10 = new Alquiler("2020-10-15", "2020-10-29", 10, cli3, esp3);
        Alquiler alq11 = new Alquiler("2020-11-2", "2020-11-17", 11, cli2, esp2);
        Alquiler alq12 = new Alquiler("2020-12-13", "2020-12-15", 10, cli3, esp3);

        ArrayList<Alquiler> alquiler = new ArrayList();
        alquiler.add(alq1);

        alquiler.add(alq2);
        alquiler.add(alq3);
        alquiler.add(alq4);
        alquiler.add(alq5);
        alquiler.add(alq6);
        alquiler.add(alq7);
        alquiler.add(alq8);
        alquiler.add(alq9);
        alquiler.add(alq10);
        alquiler.add(alq11);
        alquiler.add(alq12);

        int promedioAlquiler[] = PromAlq(alquiler, nomMeses);

        int promAnual = PromAño(promedioAlquiler);

        int maxAlquiler[] = MaxPrice(alquiler, nomMeses);

        int maxAnual = MaxAño(maxAlquiler);

        int minAlquiler[] = MinPrice(alquiler, nomMeses);

        int minAnual = MinAño(minAlquiler, maxAnual);

        for (int i = 0; i < nomMeses.length; i++)
        {
            System.out.println("El mes de  " + nomMeses[i] + "    el promedio de alquiler es de:  " + promedioAlquiler[i] + "    lo maximo fue de:   " + maxAlquiler[i] +
                    "   y lo que minimo fue:   "  + minAlquiler[i] + "\n");
        }
        System.out.println("\nEl promedio Anual es:   " + promAnual + "     El alquiler mas alto es:    " + maxAnual + "     El alquiler mas bajo es:   " + minAnual);
    }

        public static int[] MaxPrice(ArrayList<Alquiler> alquiler, String nomMeses[])
        {
            int maxAlquileres[] = new int[12];
            int max;

            for (int i = 0; i < nomMeses.length; i++)
            {
                Calendar inicio = new GregorianCalendar(2020, i, 1);
                Calendar fin = new GregorianCalendar(2020, i, 30);
                max = 0;

                for (int j = 0; j < alquiler.size(); j++)
                {
                    Calendar fecha = alquiler.get(j).FIstart();

                    if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) &&
                            ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime())))
                    {
                        if (max < alquiler.get(j).pago())
                        {
                            max = alquiler.get(j).pago();
                        }
                    }
                    else {
                        continue;
                    }
                }
                maxAlquileres[i] = max;
            }
            return maxAlquileres;
        }

        public static int[] MinPrice(ArrayList<Alquiler> alquiler, String nomMeses[])
        {
            int menorAlq[] = new int[12];
            int menor;

            for (int i = 0; i < nomMeses.length; i++) {
                Calendar inicio = new GregorianCalendar(2020, i, 1);
                Calendar fin = new GregorianCalendar(2020, i, 30);
                menor = 9999999;

                for (int j = 0; j < alquiler.size(); j++)
                {
                    Calendar fecha = alquiler.get(j).FIstart();

                    if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) &&
                            ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime())))
                    {

                        if (menor > alquiler.get(j).pago())
                        {
                            menor = alquiler.get(j).pago();
                        }
                        else {
                            continue;
                        }
                    }
                }
                if (menor != 9999999 || menor ==0)
                {
                    menorAlq[i] = menor;
                }
                else {
                    menorAlq[i] = 0;
                }
            }
            return menorAlq;
        }

        public static int[] PromAlq(ArrayList<Alquiler> alquiler, String nomMeses[])
        {
            int promAlquiler[] = new int[12];
            int sumatoria;


            for (int i = 0; i < nomMeses.length; i++)
            {
                Calendar inicio = new GregorianCalendar(2020, i, 1);
                Calendar fin = new GregorianCalendar(2020, i, 30);
                sumatoria = 0;
                int contador = 0;
                for (int j = 0; j < alquiler.size(); j++)
                {
                    Calendar fecha = alquiler.get(j).FIstart();

                    if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) &&
                            ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime())))
                    {
                        sumatoria += alquiler.get(j).pago();
                        contador++;

                    } else {
                        continue;
                    }
                }
                if (sumatoria != 0)
                promAlquiler[i] = (sumatoria / contador);
                else
                    promAlquiler[i] = 0;
            }
            return promAlquiler;
        }

    public static int PromAño(int prom[])
    {
        int promedio = 0;

        for (int i = 0; i < prom.length; i++)
        {
            promedio += prom[i];
        }
        return (promedio / 12);
    }

    public static int MaxAño(int maxAlquil[])
    {
        int max = 0;

        for (int i = 0; i < maxAlquil.length; i++)
        {
            if (max < maxAlquil[i]) {
                max = maxAlquil[i];
            }
            else {
                continue;
            }
        }
        return max;
    }

    public static int MinAño(int minAlquiler[], int maxAnual)
    {
        int min = 0;

        for (int i = 0; i < minAlquiler.length; i++)
        {
            if(i == 0)
            {
                if (maxAnual > minAlquiler[i])
                {
                    min = minAlquiler[i];
                }
            }
            else if (i > 0){
                if (min > minAlquiler[i])
                {
                    min = minAlquiler[i];
                }
                else
                    continue;
            }
        }
        return min;
    }
    }