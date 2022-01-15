package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TurretSubsystem;
import frc.robot.subsystems.DriveTrainSubsytem;
import frc.robot.Constants;
/** An example command that uses an example subsystem. */
public class FindDistance extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private TurretSubsystem m_turretSubsystem;
  private DriveTrainSubsytem m_drivetrainSubsystem;


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public FindDistance(TurretSubsystem turretSubsystem, DriveTrainSubsytem drivetrainSubsystem) {
    m_turretSubsystem = turretSubsystem;
    m_drivetrainSubsystem = drivetrainSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(turretSubsystem);
    addRequirements(drivetrainSubsystem);
  }
  @Override
  public void execute() {
      double distance = m_turretSubsystem.getLimelightDistance();
      double x = m_turretSubsystem.getLimelightX();
      System.out.println(x);
      if (x > Constants.aimErrorTolerance) {
        System.out.println("moving right");
        m_drivetrainSubsystem.drive(.15, .15);
      }
      else if (x < -Constants.aimErrorTolerance){
        System.out.println("moving left");
        m_drivetrainSubsystem.drive(-.15, -.15);
      }
      else if (distance > 160-Constants.distanceErrorTolerance) {
        System.out.println("forward");
        m_drivetrainSubsystem.drive(.15, -.15);
       }
      else if (distance < 160+Constants.distanceErrorTolerance) {
        System.out.println("backward");
        m_drivetrainSubsystem.drive(-.15, .15);
      }
    }
}

