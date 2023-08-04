package frc.robot.commands;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeUp extends CommandBase {
    private final IntakeSubsystem intakeSubsystem;

    public IntakeUp(IntakeSubsystem intakeSubsystem){
        this.intakeSubsystem = intakeSubsystem;
        addRequirements(intakeSubsystem);
    }
    
    @Override
    public void execute(){
        intakeSubsystem.moveSolenoidBackwards();
    }
    @Override
    public boolean isFinished(){
        return false;
    }

}
