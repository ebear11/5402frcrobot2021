<<<<<<< HEAD
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsytem;
import edu.wpi.first.wpilibj.Joystick;
/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrainSubsytem m_subsystem;
  private Joystick xbox = new Joystick(0);
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  // requires drivetrain sussystem
  public DriveCommand(DriveTrainSubsytem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }
  @Override
  // executes drive function that is found in  drivetrain subsystem
  public void execute() {
      m_subsystem.drive(-xbox.getRawAxis(1), xbox.getRawAxis(5));
  }
}

=======
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsytem;
import edu.wpi.first.wpilibj.Joystick;
/** An example command that uses an example subsystem. */
public class DriveCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrainSubsytem m_subsystem;
  private Joystick xbox = new Joystick(0);
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveCommand(DriveTrainSubsytem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }
  @Override
  public void execute() {
      m_subsystem.drive(-xbox.getRawAxis(1), xbox.getRawAxis(5));
  }
}

>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0
