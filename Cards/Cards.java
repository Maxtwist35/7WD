
public class Cards {
    
    //instanceof
    public static boolean isBrownCard(ACard card){
        return (card instanceof BrownCard);
    }
    
    public static boolean isGreyCard(ACard card){
        return (card instanceof GreyCard);
    }

    public static boolean isYellowCard(ACard card){
        return (card instanceof YellowCard);
    }

    public static boolean isRedCard(ACard card){
        return (card instanceof RedCard);
    }

    public static boolean isGreenCard(ACard card){
        return (card instanceof GreenCard);
    }
    
    public static boolean isBlueCard(ACard card){
        return (card instanceof BlueCard);
    }
    
    public static boolean isWonderCard(ACard card){
        return (card instanceof WonderCard);
    }
    
    //cast (useless)
    public static BrownCard toBrownCard(ACard card){
        return (BrownCard)(card);
    }
    
    public static GreyCard toGreyCard(ACard card){
        return (GreyCard)(card);
    }
   
    public static YellowCard toYellowCard(ACard card){
        return (YellowCard)(card);
    }

    public static RedCard toRedCard(ACard card){
        return (RedCard)(card);
    }

    public static GreenCard toGreenCard(ACard card){
        return (GreenCard)(card);
    }
    
    public static BlueCard toBlueCard(ACard card){
        return (BlueCard)(card);
    }
    
    public static WonderCard toWonderCard(ACard card){
        return (WonderCard)(card);
    }
    
}


