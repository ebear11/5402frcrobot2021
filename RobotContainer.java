// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.FindDistance;
import frc.robot.commands.LeftMecDriveCommand;
import frc.robot.commands.RightMecDriveCommand;
import frc.robot.subsystems.DriveTrainSubsytem;
import frc.robot.subsystems.TurretSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveTrainSubsytem m_DriveTrainSubsytem = new DriveTrainSubsytem();
  private final TurretSubsystem m_TurretSubsystem = new TurretSubsystem();
  private final DriveCommand mDriveCommand = new DriveCommand(m_DriveTrainSubsytem);
  private final LeftMecDriveCommand mLeftMecDriveCommand = new LeftMecDriveCommand(m_DriveTrainSubsytem);
  private final RightMecDriveCommand mRightMecDriveCommand = new RightMecDriveCommand(m_DriveTrainSubsytem);
  private final FindDistance mFindDistance = new FindDistance(m_TurretSubsystem, m_DriveTrainSubsytem);
<<<<<<< HEAD

  // joystick object for button inputs
=======
>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0
  private final Joystick xbox = new Joystick(0);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
<<<<<<< HEAD
    // makes the robot drive when no command is sent to the scheduler
    m_DriveTrainSubsytem.setDefaultCommand(mDriveCommand);
    // sends mecanum commands to the scheduler when POVButton are pressed
    POVButton dpadLeft = new POVButton(xbox, 270);
    POVButton dpadRight = new POVButton(xbox, 90);
    // uses finddistance command when button A is pressed
=======
    m_DriveTrainSubsytem.setDefaultCommand(mDriveCommand);
    POVButton dpadLeft = new POVButton(xbox, 270);
    POVButton dpadRight = new POVButton(xbox, 90);
>>>>>>> 7ae0e7ae39154a560722c9c474f8bb5cddfbe8a0
    JoystickButton buttonA = new JoystickButton(xbox, 1);
    dpadRight
      .whenHeld(mRightMecDriveCommand);
    dpadLeft
      .whenHeld(mLeftMecDriveCommand);
    buttonA
      .whenHeld(mFindDistance);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  // public Command getTeleopCommand() {
  //   // An ExampleCommand will run in autonomous
  //   return mDriveCommand;
  // }
}
