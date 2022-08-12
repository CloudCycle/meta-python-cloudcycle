# meta-python-cloudcycle
python packages for cloudbox bba v3

## List of required libraries 
```
pyserial==3.5
python-can==4.0.0
pynmea2==1.15.0
gpiod==1.4.0
psutil==5.8.0
paho-mqtt==1.5.1
canopen==2.0.0
versionner==1.5.3
nslookup==1.3.0
fastavro==1.3.0
asyncio==3.4.3
pyfiglet==0.8.post1
awsiotsdk==1.11.3
crcmod==1.7
tuna
pylint
numpy==1.22.4
git+ssh://git@github.com/CloudCycle/device_to_backend_schema.git
```

## How to create packages for Yocto
Packages are generated via pipoe. See https://blog.emumba.com/how-to-make-python-packages-part-of-yocto-generated-image-6d4af098eebd

### command example
_pipoe --<package_name> --python python3 [--version <preferred_version>]_ . Select MIT as license
