package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.*;

public class CatapultSubsystem extends SubsystemBase {

    private DoubleSolenoid solenoid;

    public CatapultSubsystem(){
        solenoid = new DoubleSolenoid(cCompressor, PneumaticsModuleType.CTREPCM, cSolenoidFWD, cSolenoidREV);
    }

    public void shoot(){
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void unshoot(){
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void toggle(){
        solenoid.toggle();
    }

}
