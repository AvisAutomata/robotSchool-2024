package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CatapultSubsystem;

public class CatapultCommand extends CommandBase {

    CatapultSubsystem catapultSubsystem;

    public CatapultCommand(CatapultSubsystem catapultSubsystem){
        this.catapultSubsystem = catapultSubsystem;
        addRequirements(catapultSubsystem);
    }

    @Override
    public void initialize() {
        catapultSubsystem.shoot();
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
        catapultSubsystem.unshoot();
    }
}
