package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsytem;
/** An example command that uses an example subsystem. */
public class LeftMecDriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private DriveTrainSubsytem m_subsystem;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public LeftMecDriveCommand(DriveTrainSubsytem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }
  @Override
  public void execute() {
      m_subsystem.leftMec();

  }
  public boolean isFinished() {
    return false;
}
}