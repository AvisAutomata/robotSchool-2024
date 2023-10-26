// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants
{

    public static final Joystick cJoystick = new Joystick(0);
    public static Trigger cJoystickTrigger = new Trigger(() -> cJoystick.getTrigger());

    public static class OperatorConstants
    {
        public static final int DRIVER_CONTROLLER_PORT = 0;
    }

    //TODO figure out compressor numbers and stuff
    public static final int cCompressor = 0;
    public static final int cSolenoidFWD = 7;
    public static final int cSolenoidREV = 6;

    public static final VictorSPX left = new VictorSPX(5);
    public static final VictorSPX right = new VictorSPX(3);

    public static Joystick joystick = new Joystick(0);

    public static double speedMultiplier = .25;
    //Joystick joystick2 = new Joystick(1);
}
