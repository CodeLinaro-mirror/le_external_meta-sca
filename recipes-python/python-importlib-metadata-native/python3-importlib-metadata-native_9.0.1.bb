SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://pypi.org/project/importlib-metadata/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=affe5a7d8b988c3db245c01075b29e17"

DEPENDS += "\
    python3-coherent-licensed-native \
    python3-setuptools-scm-native \
"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "importlib_metadata"

SRC_URI[sha256sum] = "ab830580bc0ef3db61ce8fae716389e5462b67e033018bab6d8f80ef17172f99"

S = "${UNPACKDIR}/importlib_metadata-${PV}"

RDEPENDS:${PN} += "python3-zipp-native"
