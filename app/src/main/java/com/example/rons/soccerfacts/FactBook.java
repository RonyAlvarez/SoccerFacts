package com.example.rons.soccerfacts;

import java.util.Random;

/**
 * Created by Rons on 2/21/2015.
 */
public class FactBook {

    // member variable
    String[] mFacts = {
            "149 - 0 is the highest score ever made in a soccer game",
            "After the whistle to start the game, soccer player Lee Todd said \"F*ck me, that was loud\" and received the fastest red card in history: 2 seconds.",
            "A 20-month-old baby became the youngest professional soccer player ever, after being signed up by a Belgian club.",
            "Qatar's 2022 World Cup will take more lives than 9/11 due to horrible working conditions for migrant workers building stadiums and infrastructure.",
            "8 of the 12 host cities for the 2014 FIFA World Cup in Brazil are among the 50 most violent cities in the world.",
            "The city of Lusail, host of the 2022 FIFA World Cup Final game, does not exist yet.",
            "In 2013, soccer player Cristiano Ronaldo opened a museum dedicated to himself.",
            "The first soccer game televised was a friendly match between Arsenal's first and second team in 1937.",
            "More than 1 in 20 soccer injuries are caused by celebrating goals on the pitch.",
            "On average, soccer players run as far as 9.5 miles in a single match.",
            "Argentina's retired soccer player Diego Maradona has his own religion made by his fans.",
            "The word \"soccer\" originated as a slang abbreviation of the word \"association\"",
            "The Vatican has its own soccer team.",
            "Ronaldinho's deal with Coca-Cola ended after he was caught sipping a Pepsi in a news conference.",
            "FIFA has more member countries than the U.N.",
            "The original 2014 World Cup's ball was produced in Pakistan.",
            "The most goals scored in a World Cup's match was 10 by Hungary against El Salvador in 1982",
            "Famous soccer player Mario Balotelli is an Italian, born to immigrants from Ghana, raised by a Jewish mother.",
            "In 1969, El Salvador waged war on Honduras  after it lost against it in a soccer match.",
            "The British coined the term \"Soccer\" in the late 1800s, not America.",
            "German soccer player Mesut Ozil donated his €300,000 World Cup victory bonus to pay for surgery of 23 children in Brazil.",
            "Soccer player Didier Drogba is credited with brokering a cease-fire in his home country of Ivory Coast that brought a five year civil war to an end.",
            "There are 32 panels on a traditional soccer ball, one for each country in Europe.",
            "Soccer developed in London’s famed Newgate Prison in the early 1800s. Prisoners who had their hands cut off for crimes of theft came up with a sport that used only the feet. The game spread from there.",
            "Known as “soccer” in the United States, the sport is known as “football” elsewhere. But the game’s original name was actually  “basket-ball” because the first goals were overturned wicker baskets. ",
            "In 1998 a lightning bolt killed an entire team during a soccer game. The 11 players of the Democratic Republic of Congo. Nobody on the opposite team was hurt.",
            "Brazilian soccer legend Pelé was born Edson Arantes do Nascimento. He took the nickname Pelé, a Brazilian Portuguese word meaning “six feet” due to being born with six toes on each foot.",
            "The first American professional soccer league, the USSA, played from 1919 to 1921 and paid its players 35-cents for every goal scored.",
            "The original World Cup was made of papier-mâché, but it had to be replaced after the heavy rains of the 1950 World Cup.",
            "Soccer balls are slightly oval-shaped. But the checkered board pattern creates an illusion of a perfect sphere.",
            "The aerosol spray used by many soccer medical staffs is simply an air freshener designed to lessen the player’s intense smell of sweat, dirt and grass so treatment can be more easily provided.",
            "Many 3rd World villages cannot afford a soccer ball, so they play soccer with balls made from rags or disposable diapers.",
            "Queen Elizabeth II was a natural athlete and, dressed in disguise, was a frequent participant in pickup up soccer matches near Buckingham Palace in her teenage years in the late 1930s and early ’40s.",
            "Until 1908, soccer balls were made from the inflated stomach tissue of executed Irish prisoners.",
            "In most countries, a soccer player’s uniform is called a “kit.” The cleats are called “hooves.”",
            "English soccer star David Beckham is a distant cousin of Texas congressman Louie Gohmert.",
            "From 1994 to 1998, the English Premier League had red, yellow and teal cards. Teal cards were used for possible fouls that were to be reviewed by instant replay.",
            "The national sport of Canada is soccer.",
            "Soccer was illegal in Mississippi until 1991.",
            "Soccer-like games were played in China as many as 2000 years ago ",
            "The first soccer nets were actually wicker baskets.",
            "A bad referee call in a game in 1964 in Peru caused a riot that resulted in the deaths of 300 people."

    };

    //method
    public String getFact() {

        String fact = "";

        // randomly select a fact
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
