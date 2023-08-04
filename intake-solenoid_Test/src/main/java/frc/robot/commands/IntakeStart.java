package frc.robot.commands;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeStart extends CommandBase{
    private final IntakeSubsystem intakeSubsystem;
    private final double speed;

    public IntakeStart(IntakeSubsystem intakeSubsystem, double speed){
        this.intakeSubsystem = intakeSubsystem;
        this.speed = speed;
        addRequirements(intakeSubsystem);
    }
    @Override
    public void execute(){
        intakeSubsystem.setMotor(speed);
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
