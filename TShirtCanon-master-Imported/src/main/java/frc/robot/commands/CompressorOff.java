package frc.robot.commands;

import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class CompressorOff extends Command {
  
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final PneumaticsSubsystem subsystem;

  public CompressorOff(PneumaticsSubsystem subsystem) {
    this.subsystem = subsystem;
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    subsystem.compressorOff();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
