#!/bin/sh

CONFIG_DIR=config

if [ -z $1 ]; then
  echo "Usage: $0 ROOT_PROJECT_DIR"
  echo "Example: $0 ../WordPress-Android"
  exit 1
fi

cp $1/config/checkstyle.xml $CONFIG_DIR/checkstyle.xml

cp $1/.editorconfig $CONFIG_DIR/.editorconfig

cp $1/.idea/checkstyle-idea.xml $CONFIG_DIR/idea/checkstyle-idea.xml
cp $1/.idea/codeStyleSettings.xml $CONFIG_DIR/idea/codeStyleSettings.xml
cp $1/.idea/compiler.xml $CONFIG_DIR/idea/compiler.xml
cp $1/.idea/encodings.xml $CONFIG_DIR/idea/encodings.xml
cp $1/.idea/externalDependencies.xml $CONFIG_DIR/idea/externalDependencies.xml
cp $1/.idea/vcs.xml $CONFIG_DIR/idea/vcs.xml

cp $1/.idea/codeStyles/codeStyleConfig.xml $CONFIG_DIR/idea/codeStyles/codeStyleConfig.xml
cp $1/.idea/codeStyles/Project.xml $CONFIG_DIR/idea/codeStyles/Project.xml

cp $1/.idea/inspectionProfiles/Project_Default.xml $CONFIG_DIR/idea/inspectionProfiles/Project_Default.xml
cp $1/.idea/inspectionProfiles/profiles_settings.xml $CONFIG_DIR/idea/inspectionProfiles/profiles_settings.xml
