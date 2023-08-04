// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.commands;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

/** An example command that uses an example subsystem. */
public class IntakeOffCommand extends SequentialCommandGroup {

  private final IntakeSubsystem intakeSubsystem;
  public IntakeOffCommand(IntakeSubsystem intakeSubsystem) {
    this.intakeSubsystem = intakeSubsystem;
    addRequirements(intakeSubsystem);
    addCommands(
        new IntakeStop(intakeSubsystem)
        .andThen(new IntakeUp(intakeSubsystem)));


  }
}