package org.jadice.gwt.spring.devmode;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.gwt.dev.jjs.JsOutputOption;
import com.google.gwt.dev.util.arg.OptionGenDir;
import com.google.gwt.dev.util.arg.OptionScriptStyle;
import com.google.gwt.dev.util.arg.OptionWorkDir;

@ConfigurationProperties(prefix = "gwt")
@Component
public class DevModeConfiguration implements OptionScriptStyle, OptionGenDir, OptionWorkDir {
  private JsOutputOption outputOption = JsOutputOption.PRETTY;

  private File genDir;

  private File workDir;
  
  @Override
  public JsOutputOption getOutput() {
    return outputOption;
  }

  @Override
  public void setOutput(final JsOutputOption obfuscated) {
    this.outputOption = obfuscated;
  }

  @Override
  public File getGenDir() {
    return genDir;
  }

  @Override
  public void setGenDir(final File dir) {
    genDir = dir;
  }

  @Override
  public File getWorkDir() {
    return workDir;
  }

  @Override
  public void setWorkDir(final File dir) {
    this.workDir = dir;
  }

}
