package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) { System.out.println("hitCount = " + hitCount);
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) { System.out.println("hitCount = " + hitCount);
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            System.out.println("hitCount = " + hitCount);

            attackedBodyPart = BodyPart.LEG;
        }
        else if (hitCount >3) { System.out.println("hitCount = " + hitCount);
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {System.out.println("hitCount = " + hitCount);
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {System.out.println("hitCount = " + hitCount);
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {System.out.println("hitCount = " + hitCount);

            defencedBodyPart = BodyPart.ARM;
        }else if (hitCount > 3) {System.out.println("hitCount = " + hitCount);
            hitCount = 0;
            defencedBodyPart = BodyPart.CHEST;
        }

        return defencedBodyPart;
    }
}
