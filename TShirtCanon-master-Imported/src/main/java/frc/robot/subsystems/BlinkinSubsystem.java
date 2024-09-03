package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BlinkinConstants;

public class BlinkinSubsystem extends SubsystemBase {
    private static Spark m_led = new Spark(11);

    
    public BlinkinSubsystem() {}
    
    @Override
    public void periodic() {

    }
     
    /**
     * @param value color value, see Constants
     */
    public static void color(double value) {
        m_led.set(value);
    }

    public static void red(){
        color(BlinkinConstants.kRed);
    }

    public void orange(){
        color(BlinkinConstants.kOrange);
    }

    public void yellow(){
        color(BlinkinConstants.kYellow);
    }

    public static void green(){
        color(BlinkinConstants.kGreen);
    }

    public void blue(){
        color(BlinkinConstants.kBlue);
    }

    public void violet(){
        color(BlinkinConstants.kViolet);
    }

    public void white(){
        color(BlinkinConstants.kWhite);
    }

    public void off(){
        color(BlinkinConstants.kBlack);
    }

    public void sparkle(){
        color(0.37);
    }

}