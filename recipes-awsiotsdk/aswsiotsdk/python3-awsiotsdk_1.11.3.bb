
SUMMARY = "AWS IoT SDK based on the AWS Common Runtime"
HOMEPAGE = "https://github.com/aws/aws-iot-device-sdk-python-v2"
AUTHOR = "AWS SDK Common Runtime Team <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.py;md5=79468b925f512c9ee1f9e4d2a01e4dc7"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/d4/06/470ae4bcefd1a2198f93f317287a2b06815f8423badfaae3f489a3110294/awsiotsdk-1.11.3.tar.gz"
SRC_URI[md5sum] = "a1e00ba65bdcc52fa666ad48177e5c16"
SRC_URI[sha256sum] = "aa39be2d7f98175f92a47450651f0bef8a1877336b4fef79a3e22f238b40b715"

S = "${WORKDIR}/awsiotsdk-1.11.3"

DEPENDS += " "
RDEPENDS_${PN} = "python3-awscrt"

BBCLASSEXTEND = "native nativesdk"
