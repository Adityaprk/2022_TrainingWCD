package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.vision.VisionPipeline;
import edu.wpi.first.wpilibj.Joystick;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;



public class Robot extends TimedRobot {




  @Override
  public void robotInit() {
    
    
  }

  @Override
  public void robotPeriodic() {


    //neoDrive.drive(rightSpeed, leftSpeed, 1.0, true);
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopPeriodic() {
    
  }

  @Override
  public void testPeriodic() {
    
  }
}
