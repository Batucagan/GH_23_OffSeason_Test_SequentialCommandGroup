package frc.robot.commands;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeDown extends CommandBase{
    private final IntakeSubsystem intakeSubsystem;

    public IntakeDown(IntakeSubsystem intakeSubsystem){
        this.intakeSubsystem = intakeSubsystem;
        addRequirements(intakeSubsystem);
    }
    @Override
    public void initialize(){
        intakeSubsystem.moveSolenoidForward();
    }
    @Override
    public boolean isFinished(){
        return false;
    }

}
