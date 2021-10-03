package com.example.android.californiathebest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DateBean implements Serializable {
    private String imageUrl;
    private String title;

    public String getImageUrl(){
        return this.imageUrl;
    }

    public DateBean(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public static List<DateBean> getDateOfGoldenGateBridge(){
        List<DateBean> list1 = new ArrayList<>();
        list1.add(new DateBean("https://www.history.com/.image/ar_4:3%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTY1MTc3MjE0MzExMDgxNTQ1/topic-golden-gate-bridge-gettyimages-177770941.jpg","PIC-0"));
        list1.add(new DateBean("https://prd-wret.s3.us-west-2.amazonaws.com/assets/palladium/production/s3fs-public/styles/full_width/public/thumbnails/image/goldengatebridge-banner_0.jpg","PIC-1"));
        list1.add(new DateBean("https://www.sfexaminer.com/wp-content/uploads/2020/03/20996098_web1_200318-sfe-GoldenGateBridge_1.jpg","PIC-2"));
        list1.add(new DateBean("https://drupal8-prod.visitcalifornia.com/sites/drupal8-prod.visitcalifornia.com/files/styles/fluid_1200/public/vc_ca101_fiveamazingthings_goldengate_goldengatebridge_videostill_1280x640_0.jpg?itok=Uay1eYXE","PIC-3"));
        list1.add(new DateBean("https://i.natgeofe.com/n/024969fc-c29a-4f2c-b51c-8604c13df722/golden-gate-painter-590.jpg","PIC-4"));
        return list1;
    }

    public static List<DateBean> getDateOfHollywoodSign(){
        List<DateBean> list2 = new ArrayList<>();
        list2.add(new DateBean("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Hollywood_Sign_%28Zuschnitt%29.jpg/1200px-Hollywood_Sign_%28Zuschnitt%29.jpg","PIC-0"));
        list2.add(new DateBean("https://www.exp1.com/los-angeles-tours/wp-content/uploads/sites/4/2020/09/hollywood_sign_hike-2-scaled.jpg","PIC-1"));
        list2.add(new DateBean("https://www.hollywoodreporter.com/wp-content/uploads/2021/03/THR_HollywoodLandscapes241000Finals-H-2021-1616778045.jpg","PIC-2"));
        list2.add(new DateBean("https://a.cdn-hotels.com/gdcs/staging66/d1705/b0a13ae5-7771-4481-8417-50c20ca22c90.jpg","PIC-3"));
        list2.add(new DateBean("https://media.tacdn.com/media/attractions-splice-spp-674x446/0b/d3/ee/29.jpg","PIC-4"));
        return list2;
    }

    public static List<DateBean> getDateOfCaliforniaStateCapitol(){
        List<DateBean> list3 = new ArrayList<>();
        list3.add(new DateBean("https://media.california.com/media/_versions/articles/optimized-shutterstock_692032534__1200x610___v1222x580.jpg","PIC-0"));
        list3.add(new DateBean("https://muc.leonardocloud.com/cdms/vmm3files/b1b4933a-348a-4da5-bd45-b749559115f4_jp.jpg","PIC-1"));
        list3.add(new DateBean("https://www.californiabeaches.com/wp-content/uploads/2017/05/california-sacramento-state-capitol-1.jpg","PIC-2"));
        list3.add(new DateBean("http://capitolmuseum.ca.gov/wp-content/uploads/virtual_tour_card_header-scaled.jpg","PIC-3"));
        list3.add(new DateBean("https://californiaglobe.com/wp-content/uploads/2020/05/0-10.jpg","PIC-4"));
        return list3;
    }

    public static List<DateBean> getDateOfMissionSanDiego() {
        List<DateBean> list4 = new ArrayList<>();
        list4.add(new DateBean("https://upload.wikimedia.org/wikipedia/commons/a/a0/Mission_San_Diego_de_Alcal%C3%A1_-_church.jpg", "PIC-0"));
        list4.add(new DateBean("https://lh3.googleusercontent.com/proxy/DXt6u5DDhGSV6gEvMiwtHVX8GgT3cay1xT4hIqMorEZ-20GjbMybG2Ii7mVSZdF31PqqIdAnov7ye6FCRjrydS09aX-I26-o0hkcUrO0bLgYEhxLO3Kg4V2eQ61BxgD9S83PF3CTm8z7RUkyYHt98veJGB73", "PIC-1"));
        list4.add(new DateBean("https://www.californiabeaches.com/wp-content/uploads/2016/04/Mission-San-Diego-Bryce-apr16-10-1000x694.jpg", "PIC-2"));
        list4.add(new DateBean("https://upload.wikimedia.org/wikipedia/commons/2/28/Mission_San_Diego%2C_est._1769.jpg", "PIC-3"));
        list4.add(new DateBean("https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/st-francis-chapel-at-mission-san-diego-christine-till.jpg", "PIC-4"));
        return list4;
    }

    public static List<DateBean> getDateOfWaltDisneyConcertHall() {
        List<DateBean> list5 = new ArrayList<>();
        list5.add(new DateBean("https://upload.wikimedia.org/wikipedia/commons/8/8c/Walt_Disney_Concert_Hall%2C_LA%2C_CA%2C_jjron_22.03.2012.jpg", "PIC-0"));
        list5.add(new DateBean("https://images.squarespace-cdn.com/content/v1/5adb89f2aa49a19e7960b934/1555274583726-YRDNRC6XARSDNYFISWJ9/walt-disney-concert-hall-mike-kelley-2.jpg", "PIC-1"));
        list5.add(new DateBean("https://3.bp.blogspot.com/-n_fi1SwONaw/W7KGwpKzqzI/AAAAAAAAGsw/I8SYUjQNKz8SlTENgySj6odpsketT9PnwCLcBGAs/s1600/Disney-181.JPG", "PIC-2"));
        list5.add(new DateBean("https://lh3.googleusercontent.com/a-u8vbW2-UX5JuXCFtk2J2p8fjcxu46l1NKyeeZBlD_q4mn6aBI7uOi0NeQ49OxqmA=s1200", "PIC-3"));
        list5.add(new DateBean("https://brianmacstayphotography.com/wp-content/uploads/2019/07/26-14914-post/Destination-Engagement-Photo-Shoot-at-the-Walt-Disney-Concert-Hall-in-Los-Angeles-2.jpg", "PIC-4"));
        return list5;
    }
}