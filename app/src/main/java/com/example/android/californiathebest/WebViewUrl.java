package com.example.android.californiathebest;

public class WebViewUrl {

    private String[][] urlArray = {
            {
                    "https://www.tripadvisor.com/Attraction_Review-g60713-d104675-Reviews-Golden_Gate_Bridge-San_Francisco_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d144152-Reviews-Hollywood_Sign-Los_Angeles_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32999-d219610-Reviews-California_State_Capitol_Museum-Sacramento_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60750-d116566-Reviews-Mission_San_Diego_de_Alcala-San_Diego_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d258384-Reviews-Walt_Disney_Concert_Hall-Los_Angeles_California.html",
                    "https://www.hpmuseum.org/garage/garage.htm",
                    "https://www.tripadvisor.com/Attraction_Review-g33052-d104238-Reviews-Santa_Monica_Pier-Santa_Monica_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d104576-Reviews-Hollywood_Walk_of_Fame-Los_Angeles_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d116887-Reviews-Griffith_Observatory-Los_Angeles_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60713-d144407-Reviews-San_Francisco_City_Hall-San_Francisco_California.html",
            },
            {
                    "https://www.tripadvisor.com/Tourism-g61000-Yosemite_National_Park_California-Vacations.html",
                    "https://www.tripadvisor.com/Tourism-g143021-Death_Valley_National_Park_Inyo_County_California-Vacations.html",
                    "https://www.tripadvisor.com/Tourism-g2193168-Redwood_National_Park_California-Vacations.html",
                    "https://www.tripadvisor.com/Tourism-g143037-Joshua_Tree_National_Park_California-Vacations.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60963-d9559894-Reviews-Sequoia_and_Kings_Canyon_National_Parks-Three_Rivers_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60935-d143240-Reviews-Pinnacles_National_Park-Paicines_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60883-d17651772-Reviews-Lassen_Volcanic_National_Park-Mineral_California.html",
                    "https://www.tripadvisor.com/Tourism-g143019-Channel_Islands_National_Park_California-Vacations.html",
                    "https://www.tripadvisor.com/Attraction_Review-g154994-d282357-Reviews-Point_Pelee_National_Park-Leamington_Ontario.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60791-d283643-Reviews-Devils_Postpile_National_Monument-Mammoth_Lakes_California.html",
            },
            {
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d147966-Reviews-The_Getty_Center-Los_Angeles_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g60750-d531819-Reviews-USS_Midway_Museum-San_Diego_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32766-d144103-Reviews-The_Hess_Collection_Winery_Art_Museum-Napa_Napa_Valley_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32999-d102772-Reviews-California_State_Railroad_Museum-Sacramento_California.html",
                    "http://www.getty.edu/",
                    "https://www.tripadvisor.com/Attraction_Review-g33020-d156816-Reviews-Rosicrucian_Egyptian_Museum-San_Jose_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32859-d1028626-Reviews-Norton_Simon_Museum-Pasadena_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32815-d108660-Reviews-Mission_San_Luis_Rey-Oceanside_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g1798615-d156888-Reviews-Tallac_Historic_Site-South_Lake_Tahoe_Lake_Tahoe_California_California.html",
                    "https://www.tripadvisor.com/Attraction_Review-g32655-d116989-Reviews-Petersen_Automotive_Museum-Los_Angeles_California.html",
            },
            {
                    "https://www.visittheusa.com/trip/pacific-coast-highway-road-trip",
                    "https://www.alltrails.com/trail/us/california/eastern-sierra-scenic-byway",
                    "https://www.nps.gov/subjects/travelroute66/index.htm",
                    "https://www.visitcalifornia.com/experience/highway-49/",
                    "https://www.visitredwoods.com/explore-the-redwoods/avenue-of-the-giants/",
                    "https://www.shastacascade.com/account/trinity-heritage-scenic-byway",
                    "https://www.parks.ca.gov/?page_id=22722",
                    "https://www.visitnapavalley.com/",
                    "https://sierranevadageotourism.org/entries/highway-49-the-golden-chain-highway/364e1622-740b-433d-94dc-6c2c12cf1cbe",
                    "https://www.visitcalifornia.com/experience/road-trip-inland-empires-rim-world/",
            }
    };

    public String getWebViewUrl(int x,int y) {
        return urlArray[x][y];
    }
}
