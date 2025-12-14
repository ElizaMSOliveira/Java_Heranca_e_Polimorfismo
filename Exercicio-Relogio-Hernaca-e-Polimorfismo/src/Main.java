/*Escreva uma hierarquia de classes para a criação de relogios para diferentes lugares do mundo, defina uma classe pai que tenha
 * as propriedades Hora, Minuto e segundo co seus respectivos getters e setters(atendendo as regas do funcionamento de um relogio)
 * e um metodo que devera retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada
 * relogio Americano e outra chamada relogio brasieiro, lembrando que para o relogio americano não existem as horas de 14 ate 24.
 * Defina tambem na super classe um metodo que ficará por responsbilidade da classe que extende-la definir seu funcinamento,
 * esse metodo deve reveber um relogio(independente da implementação) e deve-se extrair as informações dele e usa-la no objeto
 * que recebeu para setar as novas informações do relogio.*/

public class Main {

    public static void main(String[] args) {
        Clock brasilClock = new BrasilClock();
        Clock americano = new AmericanClock();
        americano.setSecond(59);
        americano.setMinute(30);
        americano.setHour(22);

        System.out.println(brasilClock.convert(americano).getTime());
        System.out.println(americano.getTime());

       // System.out.println(new AmericanClock().convert(brasilClock).getTime());

    }
}
